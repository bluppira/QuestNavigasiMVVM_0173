package com.example.pertemuan6.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(R.color.teal_700))
            )}
    ){ isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {}
            )
            HorizontalDivider(modifier = Modifier
                .padding(20.dp)
                .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .width(250.dp),
                label = {Text(text = "Alamat")},
                onValueChange = {},
            )
