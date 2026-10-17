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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaHorizontalSelectKt {
    private static ImageVector _panoramaHorizontalSelect;

    public static final ImageVector getPanoramaHorizontalSelect(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaHorizontalSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaHorizontalSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.5f);
        b.curveToRelative(-3.89f, 0.0f, -6.95f, -0.84f, -8.69f, -1.43f);
        b.curveTo(2.67f, 3.85f, 2.0f, 4.33f, 2.0f, 5.02f);
        b.lineTo(2.0f, 19.0f);
        b.curveToRelative(0.0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f);
        b.curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12.0f, 18.5f);
        b.curveToRelative(3.87f, 0.0f, 6.66f, 0.76f, 8.69f, 1.45f);
        b.curveTo(21.34f, 20.16f, 22.0f, 19.68f, 22.0f, 19.0f);
        b.lineToRelative(0.0f, -14.0f);
        b.curveToRelative(0.0f, -0.68f, -0.66f, -1.17f, -1.31f, -0.95f);
        b.curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12.0f, 5.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontalSelect = build;
        build.getClass();
        return build;
    }
}
