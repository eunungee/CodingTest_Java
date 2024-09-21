class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // currentTime(ct), 현재 체력(hp), 최대 체력(maxHp), 연속 회복 count(cntHp) 변수 생성
        int ct = attacks[0][0], hp = health, maxHp = health, cntHp = 0;

        // attackTime(at)을 앞에서부터 세주는 for문
        for (int atIdx = 0; atIdx < attacks.length; atIdx++) {
            // attackTime(at) 변수
            int at = attacks[atIdx][0];

            // 현재 시간이 공격받는 시간 이전일 때
            while (ct < at) {
                // 체력이 최대가 아니면
                if (hp < maxHp) {
                    // 회복 시간 count, hp도 x만큼 증가
                    cntHp++;
                    hp += bandage[1];
                    // 회복 시간이 t와 같다면 hp y만큼 증가
                    if (cntHp == bandage[0]) {
                        hp += bandage[2];
                        cntHp = 0;
                    }
                    // 최대 체력을 넘기면 최대 체력으로 초기화
                    if (hp > maxHp) hp = maxHp;
                }
                ct++;
            }

            // 현재 시간 = 공격 시간일 때
            if (ct == at) {
                // 회복 시간 count 초기화, 피해량만큼 체력 감소
                cntHp = 0;
                hp -= attacks[atIdx][1];
                // 체력 0 혹은 음수일 시 return -1
                if (hp <= 0) return -1;
                ct++;
            }
        }
        return hp;
    }
}