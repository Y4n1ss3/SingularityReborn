package androidx.compose.material.icons.sharp;

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
public final class EggKt {
    private static ImageVector _egg;

    public static final ImageVector getEgg(Icons.Sharp sharp) {
        ImageVector imageVector = _egg;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Egg", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveTo(8.5f, 3.0f, 5.0f, 9.33f, 5.0f, 14.0f);
        b.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        b.curveTo(19.0f, 9.33f, 15.5f, 3.0f, 12.0f, 3.0f);
        b.close();
        b.moveTo(13.0f, 18.0f);
        b.curveToRelative(-3.0f, 0.0f, -5.0f, -1.99f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -0.55f, 0.0f, -1.0f, 0.0f, -1.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f);
        b.curveToRelative(0.0f, 2.92f, 2.42f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
        b.lineToRelative(0.0f, 2.0f);
        b.curveTo(14.0f, 18.0f, 13.55f, 18.0f, 13.0f, 18.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _egg = build;
        build.getClass();
        return build;
    }
}
