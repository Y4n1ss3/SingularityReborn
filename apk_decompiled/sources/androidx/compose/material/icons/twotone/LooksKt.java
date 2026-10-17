package androidx.compose.material.icons.twotone;

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
public final class LooksKt {
    private static ImageVector _looks;

    public static final ImageVector getLooks(Icons.TwoTone twoTone) {
        ImageVector imageVector = _looks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Looks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveTo(5.93f, 6.0f, 1.0f, 10.93f, 1.0f, 17.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -4.96f, 4.04f, -9.0f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -6.07f, -4.93f, -11.0f, -11.0f, -11.0f);
        b.close();
        b.moveTo(12.0f, 12.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        b.reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _looks = build;
        build.getClass();
        return build;
    }
}
