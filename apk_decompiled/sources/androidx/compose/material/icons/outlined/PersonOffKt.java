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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.Outlined outlined) {
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 17.17f, -3.37f, -3.38f);
        e.curveToRelative(0.64f, 0.22f, 1.23f, 0.48f, 1.77f, 0.76f);
        e.curveTo(19.37f, 15.06f, 19.98f, 16.07f, 20.0f, 17.17f);
        k4.x(e, 21.19f, 21.19f, -1.41f, 1.41f);
        r6.w(e, 17.17f, 20.0f, 4.0f, -2.78f);
        e.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        e.curveToRelative(1.29f, -0.66f, 2.87f, -1.22f, 4.67f, -1.45f);
        e.lineTo(1.39f, 4.22f);
        gy.B(e, 1.41f, -1.41f, 21.19f, 21.19f);
        e.moveTo(15.17f, 18.0f);
        e.lineToRelative(-3.0f, -3.0f);
        e.curveToRelative(-0.06f, 0.0f, -0.11f, 0.0f, -0.17f, 0.0f);
        e.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        e.curveTo(6.2f, 16.5f, 6.0f, 16.84f, 6.0f, 17.22f);
        bv.z(e, 18.0f, 15.17f, 12.0f, 6.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        e.curveToRelative(0.0f, 0.86f, -0.54f, 1.59f, -1.3f, 1.87f);
        e.lineToRelative(1.48f, 1.48f);
        e.curveTo(15.28f, 10.64f, 16.0f, 9.4f, 16.0f, 8.0f);
        e.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        e.curveToRelative(-1.4f, 0.0f, -2.64f, 0.72f, -3.35f, 1.82f);
        e.lineToRelative(1.48f, 1.48f);
        e.curveTo(10.41f, 6.54f, 11.14f, 6.0f, 12.0f, 6.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOff = build;
        build.getClass();
        return build;
    }
}
