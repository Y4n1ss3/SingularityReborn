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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Sharp sharp) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FrontHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f);
        bv.A(pathBuilder, 2.0f, 15.0f, 9.0f, -1.0f);
        uf.p(pathBuilder, 0.0f, -2.5f, 11.0f, -1.0f);
        pathBuilder.verticalLineTo(1.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(7.0f);
        r6.v(pathBuilder, 4.5f, 4.5f, 11.25f);
        pathBuilder.curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f);
        pathBuilder.reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(pathBuilder, 8.0f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = build;
        build.getClass();
        return build;
    }
}
