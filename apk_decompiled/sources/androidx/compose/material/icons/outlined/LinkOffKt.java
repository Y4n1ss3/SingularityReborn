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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Outlined outlined) {
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.39f, 11.0f);
        pathBuilder.lineTo(16.0f, 12.61f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        k4.C(pathBuilder, 17.0f, 7.0f, -4.0f, 1.9f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilder.curveToRelative(0.0f, 1.27f, -0.77f, 2.37f, -1.87f, 2.84f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.curveTo(21.05f, 15.36f, 22.0f, 13.79f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        k4.x(pathBuilder, 2.0f, 4.27f, 3.11f, 3.11f);
        pathBuilder.curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        k4.k(pathBuilder, 4.0f, -1.9f, 7.0f);
        pathBuilder.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        pathBuilder.curveToRelative(0.0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f);
        r6.w(pathBuilder, 8.73f, 11.0f, 8.0f, 2.0f);
        fc.s(pathBuilder, 2.73f, 13.0f, 15.27f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.73f);
        pathBuilder.lineToRelative(4.01f, 4.01f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(pathBuilder, 3.41f, 2.86f, 2.0f, 4.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = build;
        build.getClass();
        return build;
    }
}
