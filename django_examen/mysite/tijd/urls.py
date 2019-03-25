from django.urls import path
from . import views

app_name = 'tijd'

urlpatterns = [
	path('brexit', views.brexit, name='brexit'),
]
