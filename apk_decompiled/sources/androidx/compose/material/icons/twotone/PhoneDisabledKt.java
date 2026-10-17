package androidx.compose.material.icons.twotone;

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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhoneDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.34f, 14.54f, -1.43f, -1.43f);
        e.curveToRelative(0.56f, -0.73f, 1.05f, -1.5f, 1.47f, -2.32f);
        e.lineToRelative(-2.2f, -2.2f);
        e.curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f);
        e.curveTo(15.3f, 6.45f, 15.5f, 5.25f, 15.5f, 4.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineTo(20.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(21.0f, 7.98f, 19.63f, 11.64f, 17.34f, 14.54f);
        e.close();
        e.moveTo(14.52f, 17.35f);
        e.curveTo(11.63f, 19.64f, 7.97f, 21.0f, 4.0f, 21.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineToRelative(-3.49f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.curveToRelative(1.24f, 0.0f, 2.45f, -0.2f, 3.57f, -0.57f);
        e.curveToRelative(0.1f, -0.04f, 0.21f, -0.05f, 0.31f, -0.05f);
        e.curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.71f, 0.29f);
        e.lineToRelative(2.2f, 2.2f);
        e.curveToRelative(0.81f, -0.42f, 1.58f, -0.9f, 2.3f, -1.46f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(1.42f, -1.41f);
        e.lineTo(21.19f, 21.2f);
        gy.B(e, -1.41f, 1.41f, 14.52f, 17.35f);
        e.moveTo(17.46f, 5.0f);
        e.curveToRelative(-0.06f, 0.89f, -0.21f, 1.76f, -0.45f, 2.59f);
        e.lineToRelative(1.2f, 1.2f);
        e.curveToRelative(0.41f, -1.2f, 0.67f, -2.47f, 0.76f, -3.79f);
        k4.w(e, 17.46f, 7.6f, 17.02f);
        e.curveToRelative(-0.85f, 0.24f, -1.72f, 0.39f, -2.6f, 0.45f);
        e.verticalLineToRelative(1.49f);
        e.curveToRelative(1.32f, -0.09f, 2.59f, -0.35f, 3.8f, -0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 7.6f, 17.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneDisabled = build;
        build.getClass();
        return build;
    }
}
