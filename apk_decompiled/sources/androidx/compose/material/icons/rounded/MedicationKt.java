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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MedicationKt {
    private static ImageVector _medication;

    public static final ImageVector getMedication(Icons.Rounded rounded) {
        ImageVector imageVector = _medication;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Medication", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.0f, 3.0f, 7.0f);
        d.curveTo(6.45f, 3.0f, 6.0f, 3.45f, 6.0f, 4.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(18.0f, 3.45f, 17.55f, 3.0f, 17.0f, 3.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d2 = k4.d(17.0f, 6.0f, 7.0f);
        d2.curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        d2.verticalLineToRelative(11.0f);
        d2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d2.horizontalLineToRelative(10.0f);
        d2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d2.verticalLineTo(8.0f);
        d2.curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        r6.B(d2, 14.5f, 15.0f, -1.0f, 1.0f);
        d2.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        d2.horizontalLineToRelative(0.0f);
        d2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        d2.verticalLineToRelative(-1.0f);
        d2.horizontalLineToRelative(-1.0f);
        d2.curveTo(8.67f, 15.0f, 8.0f, 14.33f, 8.0f, 13.5f);
        d2.verticalLineToRelative(0.0f);
        d2.curveTo(8.0f, 12.67f, 8.67f, 12.0f, 9.5f, 12.0f);
        d2.horizontalLineToRelative(1.0f);
        d2.verticalLineToRelative(-1.0f);
        d2.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        d2.horizontalLineToRelative(0.0f);
        d2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        d2.verticalLineToRelative(1.0f);
        d2.horizontalLineToRelative(1.0f);
        d2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        d2.verticalLineToRelative(0.0f);
        d2.curveTo(16.0f, 14.33f, 15.33f, 15.0f, 14.5f, 15.0f);
        d2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _medication = build;
        build.getClass();
        return build;
    }
}
