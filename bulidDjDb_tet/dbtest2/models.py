from django.db import models


class Class(models.Model):
    """
    班级类
    """
    classNum = models.IntegerField(unique=True)

    def __str__(self):
        return str(self.classNum)


class Teacher(models.Model):
    """
    教师类
    """
    tname = models.CharField(max_length=20)
    password = models.CharField(max_length=20)

    def __str__(self):
        return self.tname


class Student(models.Model):
    """
    学生类
    """
    sname = models.CharField(max_length=20)
    password = models.CharField(max_length=20)
    classNum = models.ForeignKey(Class, on_delete=models.CASCADE)

    def __str__(self):
        return self.sname


class Course(models.Model):
    """
    课程类
    """
    cname = models.CharField(max_length=20)
    credit = models.FloatField()
    teacher = models.ForeignKey(Teacher, on_delete=models.CASCADE)
    year = models.IntegerField()

    def __str__(self):
        return self.cname


class Score(models.Model):
    """
    成绩类
    """
    studentID = models.ForeignKey(Student, to_field='id', on_delete=models.CASCADE)
    courseID = models.ForeignKey(Course, to_field='id', on_delete=models.CASCADE)
    score = models.IntegerField()

    def __str__(self):
        return '-'.join([str(self.studentID), str(self.courseID), str(self.score)])

