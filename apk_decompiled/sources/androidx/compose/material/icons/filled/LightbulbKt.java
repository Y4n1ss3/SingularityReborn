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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightbulbKt {
    private static ImageVector _lightbulb;

    public static final ImageVector getLightbulb(Icons.Filled filled) {
        ImageVector imageVector = _lightbulb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Lightbulb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 21.0f);
        b.curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        bv.n(b, -1.0f, 9.0f, 20.0f, 1.0f);
        b.moveTo(12.0f, 2.0f);
        b.curveTo(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 2.4f, 1.2f, 4.5f, 3.0f, 5.7f);
        b.lineTo(8.0f, 17.0f);
        b.curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.3f);
        b.curveToRelative(1.8f, -1.3f, 3.0f, -3.4f, 3.0f, -5.7f);
        b.curveToRelative(0.0f, -3.9f, -3.1f, -7.0f, -7.0f, -7.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightbulb = build;
        build.getClass();
        return build;
    }
}
