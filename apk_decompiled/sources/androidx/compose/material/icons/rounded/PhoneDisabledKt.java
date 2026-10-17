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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.54f, 17.37f);
        b.curveToRelative(-2.63f, 2.08f, -5.89f, 3.39f, -9.45f, 3.61f);
        b.curveToRelative(-1.13f, 0.07f, -2.07f, -0.87f, -2.07f, -2.0f);
        b.verticalLineToRelative(-1.73f);
        b.curveToRelative(-0.01f, -1.01f, 0.75f, -1.86f, 1.76f, -1.98f);
        b.lineToRelative(2.54f, -0.29f);
        b.curveToRelative(0.61f, -0.07f, 1.21f, 0.14f, 1.64f, 0.57f);
        b.lineToRelative(1.84f, 1.84f);
        b.curveToRelative(0.81f, -0.41f, 1.59f, -0.9f, 2.31f, -1.45f);
        b.lineTo(2.1f, 4.93f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.0f);
        b.lineTo(20.49f, 20.5f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        uo.l(b, 14.54f, 17.37f, 17.39f, 10.8f);
        b.lineToRelative(-1.85f, -1.85f);
        b.curveToRelative(-0.43f, -0.43f, -0.64f, -1.03f, -0.57f, -1.64f);
        b.lineToRelative(0.29f, -2.52f);
        b.curveToRelative(0.12f, -1.01f, 0.97f, -1.77f, 1.99f, -1.77f);
        b.horizontalLineToRelative(1.73f);
        b.curveToRelative(1.13f, 0.0f, 2.07f, 0.94f, 2.0f, 2.07f);
        b.curveToRelative(-0.22f, 3.57f, -1.54f, 6.83f, -3.62f, 9.47f);
        b.lineToRelative(-1.43f, -1.43f);
        b.curveTo(16.48f, 12.4f, 16.97f, 11.62f, 17.39f, 10.8f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneDisabled = build;
        build.getClass();
        return build;
    }
}
