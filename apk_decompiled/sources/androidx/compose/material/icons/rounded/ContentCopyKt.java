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
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentCopyKt {
    private static ImageVector _contentCopy;

    public static final ImageVector getContentCopy(Icons.Rounded rounded) {
        ImageVector imageVector = _contentCopy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContentCopy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(15.0f, 20.0f, 5.0f, 7.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.horizontalLineToRelative(0.0f);
        c.curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
        c.verticalLineToRelative(13.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(10.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.verticalLineToRelative(0.0f);
        c.curveTo(16.0f, 20.45f, 15.55f, 20.0f, 15.0f, 20.0f);
        bv.g(c, 20.0f, 16.0f, 4.0f);
        c.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineTo(9.0f);
        c.curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        c.verticalLineToRelative(12.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(9.0f);
        c.curveTo(19.1f, 18.0f, 20.0f, 17.1f, 20.0f, 16.0f);
        c21.d(c, 18.0f, 16.0f, 9.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(c, 9.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentCopy = build;
        build.getClass();
        return build;
    }
}
