// ページがロードされた後に実行される処理
        function changeAction(selectedPlace) {
            console.log(selectedPlace);

            const form = document.getElementById('tutorialForm');
            form.addEventListener('submit', function(event) {
                // ここでURLパラメータを追加
                const params = new URLSearchParams();
                params.append('Name', 'Name');
                params.append('place', 'Tokyo');

                // フォームのアクションにパラメータを付け加える
                form.action = '/tutorial?' + params.toString();
            });
        };

    // セレクトボックスの値が変更されたときに呼ばれる関数
    function handlePlaceChange() {
        // セレクトボックスの選択された値を取得
        var selectedPlace = document.getElementById("place").value;
        // 取得した値をコンソールに出力
        console.log("選択された場所: " + selectedPlace);

        // バリデーション処理
        if (selectedPlace !== "選択してください") {
        　　　　　　　// 「選択してくだい」以外が選ばれた場合はボタンを有効化
                    document.getElementById("submitButton").disabled = false;
                    changeAction(selectedPlace);
                } else {
                    // 「選択してくだい」が選ばれた場合はボタンを無効化
                    document.getElementById("submitButton").disabled = true;
                }
    }