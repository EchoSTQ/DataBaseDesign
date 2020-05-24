from django.contrib import admin

from .models import *


class StudentInline(admin.StackedInline):
    model = Student
    extra = 1


class ClassAdmin(admin.ModelAdmin):
    fieldsets = [
        (None, {'fields': ['classNum']}),
    ]
    inlines = [StudentInline]


class CourseInline(admin.TabularInline):
    model = Course
    extra = 1


class TeacherAdmin(admin.ModelAdmin):
    fields = ('tname', 'password')
    inlines = [CourseInline]


class ScoreInline(admin.TabularInline):
    model = Score
    extra = 1


class StudentAdmin(admin.ModelAdmin):
    fields = ('sname', 'password', 'classNum')
    inlines = [ScoreInline]


admin.site.register(Teacher, TeacherAdmin)
admin.site.register(Class, ClassAdmin)
admin.site.register([Student, Course, Score])