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