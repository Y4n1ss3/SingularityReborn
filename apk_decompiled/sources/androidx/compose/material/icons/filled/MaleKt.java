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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MaleKt {
    private static ImageVector _male;

    public static final ImageVector getMale(Icons.Filled filled) {
        ImageVector imageVector = _male;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Male", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.5f, 11.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        b.reflectiveCurveTo(11.43f, 18.0f, 9.5f, 18.0f);
        b.reflectiveCurveTo(6.0f, 16.43f, 6.0f, 14.5f);
        b.reflectiveCurveTo(7.57f, 11.0f, 9.5f, 11.0f);
        b.close();
        b.moveTo(9.5f, 9.0f);
        b.curveTo(6.46f, 9.0f, 4.0f, 11.46f, 4.0f, 14.5f);
        b.reflectiveCurveTo(6.46f, 20.0f, 9.5f, 20.0f);
        b.reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f);
        b.curveToRelative(0.0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f);
        fc.t(b, 18.0f, 7.42f, 10.0f, 2.0f);
        uf.p(b, 4.0f, -6.0f, 2.0f, 2.58f);
        b.lineToRelative(-3.97f, 3.97f);
        b.curveTo(11.73f, 9.36f, 10.66f, 9.0f, 9.5f, 9.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _male = build;
        build.getClass();
        return build;
    }
}
