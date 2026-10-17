package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DomainDisabledKt {
    private static ImageVector _domainDisabled;

    public static final ImageVector getDomainDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _domainDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DomainDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.69f, 0.0f, 3.1f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(2.0f, 21.0f);
        i.horizontalLineToRelative(15.9f);
        i.lineToRelative(3.0f, 3.0f);
        fc.C(i, 1.41f, -1.41f, -20.9f, -20.9f);
        i.moveTo(6.0f, 19.0f);
        af0.m(i, 4.0f, 19.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 6.0f, 15.0f);
        af0.m(i, 4.0f, 15.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 4.0f, 11.0f);
        fc.w(i, 4.0f, 9.0f, 2.0f, 2.0f);
        uo.l(i, 4.0f, 11.0f, 10.0f, 19.0f);
        af0.m(i, 8.0f, 19.0f, -2.0f, 2.0f);
        kp0.z(i, 2.0f, 8.0f, 15.0f, -2.0f);
        j50.o(i, 2.0f, 2.0f, 8.0f, 15.0f);
        bv.y(i, 12.0f, 19.0f, -2.0f, 1.9f);
        gy.B(i, 2.0f, 2.0f, 12.0f, 19.0f);
        k4.C(i, 8.0f, 5.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(-0.45f);
        i.lineTo(12.0f, 9.45f);
        fc.w(i, 12.0f, 9.0f, 8.0f, 8.45f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(22.0f, 7.0f);
        i.lineTo(12.0f, 7.0f);
        i.lineTo(12.0f, 3.0f);
        r6.C(i, 5.55f, 3.0f, 8.0f, 5.45f);
        k4.C(i, 16.0f, 11.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _domainDisabled = build;
        build.getClass();
        return build;
    }
}
