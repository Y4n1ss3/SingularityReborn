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
public final class PanoramaVerticalSelectKt {
    private static ImageVector _panoramaVerticalSelect;

    public static final ImageVector getPanoramaVerticalSelect(Icons.Rounded rounded) {
        ImageVector imageVector = _panoramaVerticalSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PanoramaVerticalSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 12.0f);
        b.curveToRelative(0.0f, -3.89f, 0.84f, -6.95f, 1.43f, -8.69f);
        b.curveTo(20.15f, 2.67f, 19.67f, 2.0f, 18.98f, 2.0f);
        b.lineTo(5.0f, 2.0f);
        b.curveTo(4.32f, 2.0f, 3.84f, 2.66f, 4.05f, 3.31f);
        b.curveTo(4.74f, 5.36f, 5.5f, 8.1f, 5.5f, 12.0f);
        b.curveToRelative(0.0f, 3.87f, -0.76f, 6.66f, -1.45f, 8.69f);
        b.curveTo(3.84f, 21.34f, 4.32f, 22.0f, 5.0f, 22.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(0.68f, 0.0f, 1.17f, -0.66f, 0.95f, -1.31f);
        b.curveTo(19.27f, 18.66f, 18.5f, 15.86f, 18.5f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVerticalSelect = build;
        build.getClass();
        return build;
    }
}
