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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HomeMiniKt {
    private static ImageVector _homeMini;

    public static final ImageVector getHomeMini(Icons.Rounded rounded) {
        ImageVector imageVector = _homeMini;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HomeMini", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.0f);
        b.curveTo(4.19f, 5.0f, 2.0f, 9.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 3.86f, 3.13f, 7.0f, 6.99f, 7.0f);
        b.horizontalLineToRelative(6.02f);
        b.curveToRelative(2.69f, 0.0f, 6.99f, -2.08f, 6.99f, -7.0f);
        b.curveTo(22.0f, 12.0f, 22.0f, 5.0f, 12.0f, 5.0f);
        b.close();
        b.moveTo(12.0f, 7.0f);
        b.curveToRelative(7.64f, 0.0f, 7.99f, 4.51f, 8.0f, 5.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(4.0f, 11.8f, 4.09f, 7.0f, 12.0f, 7.0f);
        r6.g(b, 14.86f, 17.0f, 9.14f);
        b.curveToRelative(-2.1f, 0.0f, -3.92f, -1.24f, -4.71f, -3.0f);
        b.horizontalLineToRelative(15.15f);
        b.curveTo(18.78f, 15.76f, 16.96f, 17.0f, 14.86f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeMini = build;
        build.getClass();
        return build;
    }
}
