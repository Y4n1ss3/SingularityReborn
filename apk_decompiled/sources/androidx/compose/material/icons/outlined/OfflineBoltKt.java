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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Outlined outlined) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OfflineBolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.02f);
        b.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        b.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        b.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        b.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        b.close();
        b.moveTo(12.0f, 19.98f);
        b.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        b.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        b.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        b.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        k4.x(b, 12.75f, 5.0f, -4.5f, 8.5f);
        b.horizontalLineToRelative(3.14f);
        b.lineTo(11.39f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(b, 4.36f, -8.5f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = build;
        build.getClass();
        return build;
    }
}
