<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#858796';

//***여기 놓침 function선언부
// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'doughnut',
  data: {
    labels: ["Direct", "Referral", "Social"],
    datasets: [{
      data: [55, 30, 15],
      backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc'],
      hoverBackgroundColor: ['#2e59d9', '#17a673', '#2c9faf'],
      hoverBorderColor: "rgba(234, 236, 244, 1)",
    }],
  },
  options: {
    maintainAspectRatio: false,
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      caretPadding: 10,
    },
    legend: {
      display: false
    },
    cutoutPercentage: 80,
  },
});

</script>
</head>
<body>
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">Charts</h1>
		<p class="mb-4">
			Chart.js is a third party plugin that is used to generate the charts
			in this theme. The charts below have been customized - for further
			customization options, please visit the <a target="_blank"
				href="https://www.chartjs.org/docs/latest/">official Chart.js
				documentation</a>.
		</p>

		<!-- Content Row -->
		<div class="row">

			<div class="col-xl-8 col-lg-7">

				<!-- Area Chart -->
				<div class="card shadow mb-4">
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold text-primary">Area Chart</h6>
					</div>
					<div class="card-body">
						<div class="chart-area">
							<canvas id="myAreaChart"></canvas>
						</div>
						<hr>
						Styling for the area chart can be found in the
						<code>/js/demo/chart-area-demo.js</code>
						file.
					</div>
				</div>

				<!-- Bar Chart -->
				<div class="card shadow mb-4">
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold text-primary">Bar Chart</h6>
					</div>
					<div class="card-body">
						<div class="chart-bar">
							<canvas id="myBarChart"></canvas>
						</div>
						<hr>
						Styling for the bar chart can be found in the
						<code>/js/demo/chart-bar-demo.js</code>
						file.
					</div>
				</div>

			</div>

			<!-- Donut Chart -->
			<div class="col-xl-4 col-lg-5">
				<div class="card shadow mb-4">
					<!-- Card Header - Dropdown -->
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold text-primary">Donut Chart</h6>
					</div>
					<!-- Card Body -->
					<div class="card-body">
						<div class="chart-pie pt-4">
							<canvas id="myPieChart"></canvas>
						</div>
						<hr>
						Styling for the donut chart can be found in the
						<code>pieChart()</code>
						file.
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container-fluid -->
	<!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>
    <script src="js/demo/chart-bar-demo.js"></script>
</body>
</html>