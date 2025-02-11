// ページがロードされた後に実行される処理
        document.addEventListener("DOMContentLoaded", function() {
            const form = document.getElementById('tutorialForm');
            console.log('JSファイル上');

            form.addEventListener('submit', function(event) {
                // ここでURLパラメータを追加
                const params = new URLSearchParams();
                params.append('place', 'Tokyo'); // パラメータ place の値
                params.append('Name', 'Name'); // 現在の日付と時刻

                // フォームのアクションにパラメータを付け加える
                form.action = '/tutorial?' + params.toString();
            });
        });