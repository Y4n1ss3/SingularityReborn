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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SupervisorAccountKt {
    private static ImageVector _supervisorAccount;

    public static final ImageVector getSupervisorAccount(Icons.Rounded rounded) {
        ImageVector imageVector = _supervisorAccount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SupervisorAccount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 12.0f);
        b.curveToRelative(1.38f, 0.0f, 2.49f, -1.12f, 2.49f, -2.5f);
        b.reflectiveCurveTo(17.88f, 7.0f, 16.5f, 7.0f);
        b.reflectiveCurveTo(14.0f, 8.12f, 14.0f, 9.5f);
        b.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        b.close();
        b.moveTo(9.0f, 11.0f);
        b.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        b.reflectiveCurveTo(10.66f, 5.0f, 9.0f, 5.0f);
        b.reflectiveCurveTo(6.0f, 6.34f, 6.0f, 8.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(16.5f, 14.0f);
        b.curveToRelative(-1.83f, 0.0f, -5.5f, 0.92f, -5.5f, 2.75f);
        b.lineTo(11.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.25f);
        b.curveToRelative(0.0f, -1.83f, -3.67f, -2.75f, -5.5f, -2.75f);
        b.close();
        b.moveTo(9.0f, 13.0f);
        b.curveToRelative(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        b.lineTo(2.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(6.0f);
        b.verticalLineToRelative(-2.25f);
        b.curveToRelative(0.0f, -0.85f, 0.33f, -2.34f, 2.37f, -3.47f);
        b.curveTo(10.5f, 13.1f, 9.66f, 13.0f, 9.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisorAccount = build;
        build.getClass();
        return build;
    }
}
