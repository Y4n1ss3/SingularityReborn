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
public final class FilterAltKt {
    private static ImageVector _filterAlt;

    public static final ImageVector getFilterAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _filterAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.25f, 5.61f);
        b.curveTo(6.57f, 8.59f, 10.0f, 13.0f, 10.0f, 13.0f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-5.0f);
        b.curveToRelative(0.0f, 0.0f, 3.43f, -4.41f, 5.75f, -7.39f);
        b.curveTo(20.26f, 4.95f, 19.79f, 4.0f, 18.95f, 4.0f);
        b.horizontalLineTo(5.04f);
        b.curveTo(4.21f, 4.0f, 3.74f, 4.95f, 4.25f, 5.61f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterAlt = build;
        build.getClass();
        return build;
    }
}
