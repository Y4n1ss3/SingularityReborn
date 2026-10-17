package defpackage;

import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fq0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SliderColors e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ fq0(SliderColors sliderColors, boolean z, int i) {
        this.d = i;
        this.e = sliderColors;
        this.f = z;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Track_mnvyFg4$lambda$19$lambda$18;
        w01 Track_4EFweAY$lambda$35$lambda$34;
        w01 CenteredTrack_7LSsfP0$lambda$23$lambda$22;
        w01 Track_4EFweAY$lambda$15$lambda$14;
        w01 Track_mnvyFg4$lambda$39$lambda$38;
        DrawScope drawScope = (DrawScope) obj;
        Offset offset = (Offset) obj2;
        switch (this.d) {
            case 0:
                Track_mnvyFg4$lambda$19$lambda$18 = SliderDefaults.Track_mnvyFg4$lambda$19$lambda$18(this.e, this.f, drawScope, offset);
                return Track_mnvyFg4$lambda$19$lambda$18;
            case 1:
                Track_4EFweAY$lambda$35$lambda$34 = SliderDefaults.Track_4EFweAY$lambda$35$lambda$34(this.e, this.f, drawScope, offset);
                return Track_4EFweAY$lambda$35$lambda$34;
            case 2:
                CenteredTrack_7LSsfP0$lambda$23$lambda$22 = SliderDefaults.CenteredTrack_7LSsfP0$lambda$23$lambda$22(this.e, this.f, drawScope, offset);
                return CenteredTrack_7LSsfP0$lambda$23$lambda$22;
            case 3:
                Track_4EFweAY$lambda$15$lambda$14 = SliderDefaults.Track_4EFweAY$lambda$15$lambda$14(this.e, this.f, drawScope, offset);
                return Track_4EFweAY$lambda$15$lambda$14;
            default:
                Track_mnvyFg4$lambda$39$lambda$38 = SliderDefaults.Track_mnvyFg4$lambda$39$lambda$38(this.e, this.f, drawScope, offset);
                return Track_mnvyFg4$lambda$39$lambda$38;
        }
    }
}
