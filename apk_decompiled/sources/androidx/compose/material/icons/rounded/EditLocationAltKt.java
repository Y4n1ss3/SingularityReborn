package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationAltKt {
    private static ImageVector _editLocationAlt;

    public static final ImageVector getEditLocationAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _editLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.54f, 13.0f, 10.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(8.46f);
        d.curveTo(9.0f, 8.2f, 9.11f, 7.94f, 9.29f, 7.76f);
        d.lineToRelative(5.32f, -5.32f);
        d.curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f);
        d.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        d.curveToRelative(0.0f, 3.18f, 2.44f, 6.92f, 7.33f, 11.22f);
        d.curveToRelative(0.38f, 0.33f, 0.96f, 0.33f, 1.34f, 0.0f);
        d.curveTo(17.56f, 17.12f, 20.0f, 13.37f, 20.0f, 10.2f);
        d.curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f);
        d.lineToRelative(-5.31f, 5.31f);
        d.curveTo(14.06f, 12.89f, 13.8f, 13.0f, 13.54f, 13.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.0f, 11.0f, 2.12f, 0.0f);
        e.lineToRelative(6.16f, -6.16f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.12f, -2.12f, -6.16f, 6.16f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.71f, 2.0f, 20.0f, 1.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(-0.72f, 0.72f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(0.72f, -0.72f);
        i.curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocationAlt = build;
        build.getClass();
        return build;
    }
}
