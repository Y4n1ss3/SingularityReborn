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
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HlsOffKt {
    private static ImageVector _hlsOff;

    public static final ImageVector getHlsOff(Icons.Outlined outlined) {
        ImageVector imageVector = _hlsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HlsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(17.83f, 15.0f, 1.67f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-1.5f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.g(a, 17.0f, -1.0f, 2.0f, 11.0f);
        a.horizontalLineToRelative(1.5f);
        a.verticalLineToRelative(-1.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(-3.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(1.5f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        af0.g(a, 19.0f, 1.0f, -2.0f, 13.0f);
        gy.n(a, -1.17f, 17.83f, 15.0f);
        kp0.C(a, 8.0f, 10.83f, 15.0f, 6.5f);
        bv.B(a, -2.5f, -2.0f, 15.0f, 3.0f);
        uf.p(a, 9.0f, 1.5f, 2.0f, 2.0f);
        a.verticalLineTo(9.33f);
        a.lineTo(1.39f, 4.22f);
        a.lineToRelative(1.41f, -1.41f);
        a.lineToRelative(18.38f, 18.38f);
        a.lineToRelative(-1.41f, 1.41f);
        r6.w(a, 12.17f, 15.0f, 10.0f, -2.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 8.0f, 10.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hlsOff = build;
        build.getClass();
        return build;
    }
}
