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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsBackupRestoreKt {
    private static ImageVector _settingsBackupRestore;

    public static final ImageVector getSettingsBackupRestore(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsBackupRestore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsBackupRestore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.77f, 3.0f);
        b.curveToRelative(-2.65f, 0.07f, -5.0f, 1.28f, -6.6f, 3.16f);
        b.lineTo(3.85f, 4.85f);
        b.curveTo(3.54f, 4.54f, 3.0f, 4.76f, 3.0f, 5.21f);
        b.verticalLineTo(9.5f);
        b.curveTo(3.0f, 9.78f, 3.22f, 10.0f, 3.5f, 10.0f);
        b.horizontalLineToRelative(4.29f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        b.lineTo(6.59f, 7.59f);
        b.curveTo(7.88f, 6.02f, 9.82f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(4.32f, 0.0f, 7.74f, 3.94f, 6.86f, 8.41f);
        b.curveToRelative(-0.54f, 2.77f, -2.81f, 4.98f, -5.58f, 5.47f);
        b.curveToRelative(-3.8f, 0.68f, -7.18f, -1.74f, -8.05f, -5.16f);
        b.curveTo(5.11f, 13.3f, 4.71f, 13.0f, 4.27f, 13.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.65f, 0.0f, -1.14f, 0.61f, -0.98f, 1.23f);
        b.curveTo(4.28f, 18.12f, 7.8f, 21.0f, 12.0f, 21.0f);
        b.curveToRelative(5.06f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f);
        b.curveTo(20.86f, 6.86f, 16.65f, 2.88f, 11.77f, 3.0f);
        b.close();
        b.moveTo(14.0f, 12.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.0f, 13.1f, 14.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBackupRestore = build;
        build.getClass();
        return build;
    }
}
