package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneDisabledKt {
    private static ImageVector _phoneDisabled;

    public static final ImageVector getPhoneDisabled(Icons.Filled filled) {
        ImageVector imageVector = _phoneDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhoneDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.34f, 14.54f, -1.43f, -1.43f);
        e.curveToRelative(0.56f, -0.73f, 1.05f, -1.5f, 1.47f, -2.32f);
        e.lineToRelative(-2.2f, -2.2f);
        e.curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f);
        e.curveToRelative(0.37f, -1.12f, 0.57f, -2.32f, 0.57f, -3.57f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.lineTo(20.0f, 3.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.curveToRelative(0.0f, 3.98f, -1.37f, 7.64f, -3.66f, 10.54f);
        e.close();
        e.moveTo(14.52f, 17.35f);
        e.curveTo(11.63f, 19.64f, 7.97f, 21.0f, 4.0f, 21.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineToRelative(-3.49f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.curveToRelative(1.24f, 0.0f, 2.45f, -0.2f, 3.57f, -0.57f);
        e.curveToRelative(0.35f, -0.12f, 0.75f, -0.03f, 1.02f, 0.24f);
        e.lineToRelative(2.2f, 2.2f);
        e.curveToRelative(0.81f, -0.42f, 1.58f, -0.9f, 2.3f, -1.46f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(1.42f, -1.41f);
        e.lineTo(21.19f, 21.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.41f, 1.41f, -5.26f, -5.26f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneDisabled = build;
        build.getClass();
        return build;
    }
}
