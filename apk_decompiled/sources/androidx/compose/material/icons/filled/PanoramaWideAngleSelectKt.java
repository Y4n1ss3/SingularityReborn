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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaWideAngleSelectKt {
    private static ImageVector _panoramaWideAngleSelect;

    public static final ImageVector getPanoramaWideAngleSelect(Icons.Filled filled) {
        ImageVector imageVector = _panoramaWideAngleSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanoramaWideAngleSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-2.73f, 0.0f, -5.22f, 0.24f, -7.95f, 0.72f);
        b.lineToRelative(-0.93f, 0.16f);
        b.lineToRelative(-0.25f, 0.9f);
        b.curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f);
        b.lineToRelative(0.25f, 0.89f);
        b.lineToRelative(0.93f, 0.16f);
        b.curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f);
        b.reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f);
        b.lineToRelative(0.93f, -0.16f);
        b.lineToRelative(0.25f, -0.89f);
        b.curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f);
        b.reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f);
        b.lineToRelative(-0.25f, -0.89f);
        b.lineToRelative(-0.93f, -0.16f);
        b.curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaWideAngleSelect = build;
        build.getClass();
        return build;
    }
}
