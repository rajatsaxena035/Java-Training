var a=angular.module("myApp",[]);
a.directive("myDirective",function()
{
	return {
		restrict: "M",
		replace: true,
		template: "<h1>Scooby</h1>"
		};		
});