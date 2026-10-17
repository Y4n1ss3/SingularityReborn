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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerifiedUserKt {
    private static ImageVector _verifiedUser;

    public static final ImageVector getVerifiedUser(Icons.Rounded rounded) {
        ImageVector imageVector = _verifiedUser;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerifiedUser", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.19f, 1.36f, -7.0f, 3.11f);
        e.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        e.lineTo(3.0f, 11.0f);
        e.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        e.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        e.lineTo(21.0f, 6.3f);
        e.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        e.lineToRelative(-7.0f, -3.11f);
        e.curveToRelative(-0.51f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        k4.r(e, 9.29f, 16.29f, 6.7f, 13.7f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineTo(10.0f, 14.17f);
        e.lineToRelative(5.88f, -5.88f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(-6.59f, 6.59f);
        e.curveToRelative(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verifiedUser = build;
        build.getClass();
        return build;
    }
}
