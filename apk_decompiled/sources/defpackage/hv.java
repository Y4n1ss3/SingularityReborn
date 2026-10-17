package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hv extends us0 implements my {
    public int d;
    public List e;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(int i, String str, String str2, hm hmVar) {
        super(2, hmVar);
        this.g = i;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new hv(this.g, this.h, this.i, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((hv) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        List list;
        int i2 = this.f;
        hm hmVar = null;
        int i3 = 1;
        int i4 = 2;
        vn vnVar = vn.d;
        if (i2 == 0) {
            p10.Q(obj);
            List list2 = iv.a;
            int b = iv.b();
            Integer num = (Integer) yi.x0(iv.c());
            int h = y80.h(this.g, b, num != null ? num.intValue() : 8500);
            this.d = h;
            this.f = 1;
            nq nqVar = nr.a;
            Object H = p01.H(hq.d, new gv(i4, 0, hmVar), this);
            if (H != vnVar) {
                i = h;
                obj = H;
            }
            return vnVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            list = this.e;
            p10.Q(obj);
            List list3 = (List) obj;
            String u0 = yi.u0(list, "\n    ", null, null, new qo(23), 30);
            String u02 = yi.u0(list, "\n    ", null, null, new qo(24), 30);
            List list4 = iv.a;
            String u03 = yi.u0(list3, "\n        ", null, null, new wd(!hr.c() ? "pwm1" : "rpm", 13), 30);
            StringBuilder k = j50.k("\n            #!/system/bin/sh\n    ", u0, "\n            was_asleep=0\n            while true; do\n                rpm=$(cat \"", this.h, "\" 2>/dev/null)\n                if [ -z \"$rpm\" ]; then rpm=");
            k.append(i);
            k.append("; fi\n                sleep_mode=$(cat \"");
            k.append(this.i);
            k.append("\" 2>/dev/null)\n                asleep=0\n                if [ \"$sleep_mode\" = \"1\" ]; then\n                    wakefulness=$(dumpsys power 2>/dev/null | grep -m1 'mWakefulness=')\n                    case \"$wakefulness\" in\n                        *Asleep*) asleep=1 ;;\n                    esac\n                fi\n                if [ \"$asleep\" = \"1\" ]; then\n                    if [ \"$was_asleep\" != \"1\" ]; then\n    ");
            k.append(u02);
            k.append("\n                    fi\n                else\n                    if [ \"$was_asleep\" != \"0\" ]; then\n    ");
            k.append(u0);
            k.append("\n                    fi\n    ");
            k.append(u03);
            k.append("\n                fi\n                was_asleep=$asleep\n                sleep 5\n            done\n        ");
            return es0.W(k.toString());
        }
        i = this.d;
        p10.Q(obj);
        List list5 = (List) obj;
        List list6 = iv.a;
        this.e = list5;
        this.d = i;
        this.f = 2;
        nq nqVar2 = nr.a;
        Object H2 = p01.H(hq.d, new gv(i4, i3, hmVar), this);
        if (H2 != vnVar) {
            list = list5;
            obj = H2;
            List list32 = (List) obj;
            String u04 = yi.u0(list, "\n    ", null, null, new qo(23), 30);
            String u022 = yi.u0(list, "\n    ", null, null, new qo(24), 30);
            List list42 = iv.a;
            String u032 = yi.u0(list32, "\n        ", null, null, new wd(!hr.c() ? "pwm1" : "rpm", 13), 30);
            StringBuilder k2 = j50.k("\n            #!/system/bin/sh\n    ", u04, "\n            was_asleep=0\n            while true; do\n                rpm=$(cat \"", this.h, "\" 2>/dev/null)\n                if [ -z \"$rpm\" ]; then rpm=");
            k2.append(i);
            k2.append("; fi\n                sleep_mode=$(cat \"");
            k2.append(this.i);
            k2.append("\" 2>/dev/null)\n                asleep=0\n                if [ \"$sleep_mode\" = \"1\" ]; then\n                    wakefulness=$(dumpsys power 2>/dev/null | grep -m1 'mWakefulness=')\n                    case \"$wakefulness\" in\n                        *Asleep*) asleep=1 ;;\n                    esac\n                fi\n                if [ \"$asleep\" = \"1\" ]; then\n                    if [ \"$was_asleep\" != \"1\" ]; then\n    ");
            k2.append(u022);
            k2.append("\n                    fi\n                else\n                    if [ \"$was_asleep\" != \"0\" ]; then\n    ");
            k2.append(u04);
            k2.append("\n                    fi\n    ");
            k2.append(u032);
            k2.append("\n                fi\n                was_asleep=$asleep\n                sleep 5\n            done\n        ");
            return es0.W(k2.toString());
        }
        return vnVar;
    }
}
