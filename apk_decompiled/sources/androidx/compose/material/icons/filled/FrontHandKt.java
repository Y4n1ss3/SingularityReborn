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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Filled filled) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FrontHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.75f, 8.0f);
        b.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        b.verticalLineTo(15.0f);
        b.horizontalLineTo(18.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        b.horizontalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f);
        b.lineToRelative(0.0f, -10.78f);
        b.curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f);
        b.curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f);
        uf.z(b, 11.0f, -1.0f, 1.25f);
        b.curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f);
        b.reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f);
        uf.z(b, 11.0f, -1.0f, 2.75f);
        b.curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f);
        b.reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f);
        uo.j(b, 12.0f, 7.0f, 5.75f);
        b.curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f);
        b.reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f);
        b.reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f);
        b.verticalLineToRelative(-6.5f);
        b.curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = build;
        build.getClass();
        return build;
    }
}
