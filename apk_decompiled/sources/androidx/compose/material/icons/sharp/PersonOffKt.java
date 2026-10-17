package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.Sharp sharp) {
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PersonOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.65f, 5.82f);
        b.curveTo(9.36f, 4.72f, 10.6f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.4f, -0.72f, 2.64f, -1.82f, 3.35f);
        uo.l(b, 8.65f, 5.82f, 20.0f, 17.17f);
        b.curveToRelative(-0.02f, -1.1f, -0.63f, -2.11f, -1.61f, -2.62f);
        b.curveToRelative(-0.54f, -0.28f, -1.13f, -0.54f, -1.77f, -0.76f);
        uo.l(b, 20.0f, 17.17f, 21.19f, 21.19f);
        b.lineTo(2.81f, 2.81f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(8.89f, 8.89f);
        b.curveToRelative(-1.81f, 0.23f, -3.39f, 0.79f, -4.67f, 1.45f);
        b.curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f);
        uo.u(b, 20.0f, 13.17f, 2.61f, 2.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOff = build;
        build.getClass();
        return build;
    }
}
