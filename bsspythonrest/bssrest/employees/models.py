from django.db import models


class employee(models.Model):
    bss_id = models.CharField(unique=True, blank=False, max_length=30, editable=False)
    employee_name=models.CharField(blank=False, max_length=150, editable=False)
    designation=models.CharField(blank=False,max_length=50, editable=True)
    post_office=models.CharField(blank=False,max_length=50,editable=True)
    police_station=models.CharField(blank=False,max_length=50,editable=True)
    
# Create your models here.
