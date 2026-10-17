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
import defpackage.af0;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelOffKt {
    private static ImageVector _labelOff;

    public static final ImageVector getLabelOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _labelOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LabelOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 7.03f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(9.97f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-5.37f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(pathBuilder, 7.29f, 7.29f, 19.55f, 12.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.0f, 7.0f, 3.55f, 5.0f);
        e.lineToRelative(-1.63f, 2.29f);
        e.lineToRelative(1.43f, 1.43f);
        e.lineTo(22.0f, 12.0f);
        e.lineToRelative(-4.37f, -6.16f);
        e.curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f);
        e.lineToRelative(-7.37f, 0.01f);
        gy.B(e, 2.0f, 1.99f, 16.0f, 7.0f);
        e.moveTo(2.0f, 4.03f);
        e.lineToRelative(1.58f, 1.58f);
        e.curveTo(3.22f, 5.96f, 3.0f, 6.46f, 3.0f, 7.0f);
        e.verticalLineToRelative(10.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 1.99f, 2.0f, 1.99f);
        e.lineTo(16.0f, 19.0f);
        e.curveToRelative(0.28f, 0.0f, 0.55f, -0.07f, 0.79f, -0.18f);
        e.lineTo(18.97f, 21.0f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 3.41f, 2.62f, 2.0f, 4.03f);
        e.moveTo(5.0f, 7.03f);
        e.lineTo(14.97f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 5.0f, 17.0f, 5.0f, 7.03f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelOff = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLabelOff$annotations(Icons.TwoTone twoTone) {
    }
}
