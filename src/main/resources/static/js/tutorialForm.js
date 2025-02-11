// セレクトボックスの値が変更されたときに呼ばれる関数
    function handlePlaceChange() {
        // セレクトボックスの選択された値を取得
        var selectedName = document.getElementById("place").value;

        // バリデーション処理
        if (selectedName !== "選択してください") {
        　　　　　　　// 取得した値をコンソールに出力
                    console.log("選択された名前: " + selectedName);
        　　　　　　　// 「選択してください」以外が選ばれた場合はボタンを有効化
                    document.getElementById("submitButton").disabled = false;
                    changeAction(selectedName);
                } else {
                    // 「選択してください」が選ばれた場合はボタンを無効化
                    document.getElementById("submitButton").disabled = true;
                }
    }

// セレクトボックスの変更後の値が「選択してください」意外だとhandlePlaceChange関数から呼ばれる
        function changeAction(selectedName) {
            const form = document.getElementById('tutorialForm');
            form.addEventListener('submit', function(event) {
                // ここでURLパラメータを追加
                const params = new URLSearchParams();
                params.append('Name', selectedName);

                // フォームのアクションにパラメータを付け加える
                form.action = '/tutorial?' + params.toString();
            });
        };