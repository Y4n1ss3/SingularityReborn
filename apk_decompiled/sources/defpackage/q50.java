package defpackage;

import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q50 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ty h;

    public /* synthetic */ q50(long j, Object obj, ty tyVar, int i, int i2) {
        this.d = i2;
        this.e = j;
        this.g = obj;
        this.h = tyVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvideTextStyleFromToken_3J_VO9M$lambda$12;
        w01 Indicator_3J_VO9M$lambda$45;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ProvideTextStyleFromToken_3J_VO9M$lambda$12 = ListItemKt.ProvideTextStyleFromToken_3J_VO9M$lambda$12(this.e, (TypographyKeyTokens) this.g, (my) this.h, this.f, (Composer) obj, intValue);
                return ProvideTextStyleFromToken_3J_VO9M$lambda$12;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Indicator_3J_VO9M$lambda$45 = NavigationItemKt.Indicator_3J_VO9M$lambda$45(this.e, (Shape) this.g, (iy) this.h, this.f, (Composer) obj, intValue2);
                return Indicator_3J_VO9M$lambda$45;
        }
    }
}
