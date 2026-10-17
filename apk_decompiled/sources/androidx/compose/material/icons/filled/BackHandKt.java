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
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Filled filled) {
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BackHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 24.0f);
        b.curveToRelative(-3.26f, 0.0f, -6.19f, -1.99f, -7.4f, -5.02f);
        b.lineToRelative(-3.03f, -7.61f);
        b.curveTo(2.26f, 10.58f, 3.0f, 9.79f, 3.81f, 10.05f);
        b.lineToRelative(0.79f, 0.26f);
        b.curveToRelative(0.56f, 0.18f, 1.02f, 0.61f, 1.24f, 1.16f);
        fc.v(b, 7.25f, 15.0f, 8.0f, 3.25f);
        b.curveTo(8.0f, 2.56f, 8.56f, 2.0f, 9.25f, 2.0f);
        b.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        uf.z(b, 12.0f, 1.0f, 1.25f);
        b.curveTo(11.5f, 0.56f, 12.06f, 0.0f, 12.75f, 0.0f);
        b.reflectiveCurveTo(14.0f, 0.56f, 14.0f, 1.25f);
        uf.z(b, 12.0f, 1.0f, 2.75f);
        b.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        b.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        uf.z(b, 12.0f, 1.0f, 5.75f);
        b.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        b.reflectiveCurveTo(21.0f, 5.06f, 21.0f, 5.75f);
        b.verticalLineTo(16.0f);
        b.curveTo(21.0f, 20.42f, 17.42f, 24.0f, 13.0f, 24.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backHand = build;
        build.getClass();
        return build;
    }
}
