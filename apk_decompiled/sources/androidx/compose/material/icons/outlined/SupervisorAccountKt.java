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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SupervisorAccountKt {
    private static ImageVector _supervisorAccount;

    public static final ImageVector getSupervisorAccount(Icons.Outlined outlined) {
        ImageVector imageVector = _supervisorAccount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SupervisorAccount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 12.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(10.93f, 5.0f, 9.0f, 5.0f);
        b.reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f);
        b.reflectiveCurveTo(7.07f, 12.0f, 9.0f, 12.0f);
        b.close();
        b.moveTo(9.0f, 7.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(9.83f, 10.0f, 9.0f, 10.0f);
        b.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(8.17f, 7.0f, 9.0f, 7.0f);
        k4.r(b, 9.05f, 17.0f, 4.77f, 17.0f);
        b.curveToRelative(0.99f, -0.5f, 2.7f, -1.0f, 4.23f, -1.0f);
        b.curveToRelative(0.11f, 0.0f, 0.23f, 0.01f, 0.34f, 0.01f);
        b.curveToRelative(0.34f, -0.73f, 0.93f, -1.33f, 1.64f, -1.81f);
        b.curveToRelative(-0.73f, -0.13f, -1.42f, -0.2f, -1.98f, -0.2f);
        b.curveToRelative(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        fc.w(b, 2.0f, 19.0f, 7.0f, -1.5f);
        b.curveToRelative(0.0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f);
        b.close();
        b.moveTo(16.5f, 14.5f);
        b.curveToRelative(-1.84f, 0.0f, -5.5f, 1.01f, -5.5f, 3.0f);
        fc.w(b, 11.0f, 19.0f, 11.0f, -1.5f);
        b.curveToRelative(0.0f, -1.99f, -3.66f, -3.0f, -5.5f, -3.0f);
        b.close();
        b.moveTo(17.71f, 12.68f);
        b.curveToRelative(0.76f, -0.43f, 1.29f, -1.24f, 1.29f, -2.18f);
        b.curveTo(19.0f, 9.12f, 17.88f, 8.0f, 16.5f, 8.0f);
        b.reflectiveCurveTo(14.0f, 9.12f, 14.0f, 10.5f);
        b.curveToRelative(0.0f, 0.94f, 0.53f, 1.75f, 1.29f, 2.18f);
        b.curveToRelative(0.36f, 0.2f, 0.77f, 0.32f, 1.21f, 0.32f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.85f, -0.12f, 1.21f, -0.32f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisorAccount = build;
        build.getClass();
        return build;
    }
}
