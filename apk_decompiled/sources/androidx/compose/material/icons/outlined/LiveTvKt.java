package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiveTvKt {
    private static ImageVector _liveTv;

    public static final ImageVector getLiveTv(Icons.Outlined outlined) {
        ImageVector imageVector = _liveTv;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LiveTv", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 10.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineToRelative(7.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-7.58f);
        pathBuilder.lineToRelative(3.29f, -3.29f);
        pathBuilder.lineTo(16.0f, 2.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-0.69f, 0.71f);
        pathBuilder.lineTo(10.56f, 6.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(pathBuilder, 21.0f, 20.0f, 3.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(pathBuilder, 3.0f, 8.0f, 18.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liveTv = build;
        build.getClass();
        return build;
    }
}
