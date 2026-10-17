package androidx.compose.material.icons.rounded;

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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DomainDisabledKt {
    private static ImageVector _domainDisabled;

    public static final ImageVector getDomainDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _domainDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DomainDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(0.71f, 2.39f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(2.0f, 5.1f);
        b.lineTo(2.0f, 19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(13.9f);
        b.lineToRelative(2.29f, 2.29f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(2.12f, 2.39f);
        b.curveTo(1.73f, 2.0f, 1.1f, 2.0f, 0.71f, 2.39f);
        k4.r(b, 6.0f, 19.0f, 4.0f, 19.0f);
        r6.p(b, -2.0f, 2.0f, 2.0f);
        b.moveTo(6.0f, 15.0f);
        af0.m(b, 4.0f, 15.0f, -2.0f, 2.0f);
        r6.l(b, 2.0f, 4.0f, 11.0f);
        fc.w(b, 4.0f, 9.0f, 2.0f, 2.0f);
        uo.l(b, 4.0f, 11.0f, 10.0f, 19.0f);
        af0.m(b, 8.0f, 19.0f, -2.0f, 2.0f);
        kp0.z(b, 2.0f, 8.0f, 15.0f, -2.0f);
        j50.o(b, 2.0f, 2.0f, 8.0f, 15.0f);
        bv.y(b, 12.0f, 19.0f, -2.0f, 1.9f);
        gy.B(b, 2.0f, 2.0f, 12.0f, 19.0f);
        k4.C(b, 8.0f, 5.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(-0.45f);
        b.lineTo(12.0f, 9.45f);
        b.lineTo(12.0f, 9.0f);
        b.horizontalLineToRelative(7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(7.45f);
        b.lineToRelative(2.0f, 2.0f);
        b.lineTo(22.0f, 9.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-8.0f);
        b.lineTo(12.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(5.55f, 3.0f);
        r6.C(b, 8.0f, 5.45f, 8.0f, 5.0f);
        k4.C(b, 16.0f, 11.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _domainDisabled = build;
        build.getClass();
        return build;
    }
}
