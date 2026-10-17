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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.TwoTone twoTone) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LayersClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 13.47f, 0.67f, -0.53f);
        gy.B(e, -5.02f, -5.02f, 6.26f, 9.0f);
        e.moveTo(12.0f, 4.53f);
        e.lineToRelative(-1.17f, 0.91f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 5.02f, 5.03f, 17.74f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 4.53f, 17.74f, 9.0f);
        i.lineToRelative(-1.89f, 1.47f);
        i.lineToRelative(1.43f, 1.42f);
        i.lineTo(21.0f, 9.0f);
        i.lineToRelative(-9.0f, -7.0f);
        fc.C(i, -2.59f, 2.02f, 1.42f, 1.42f);
        i.moveTo(21.0f, 14.07f);
        i.lineToRelative(-1.63f, -1.27f);
        fc.C(i, -0.67f, 0.52f, 1.43f, 1.43f);
        i.moveTo(3.41f, 0.86f);
        i.lineTo(2.0f, 2.27f);
        i.lineToRelative(4.22f, 4.22f);
        i.lineTo(3.0f, 9.0f);
        i.lineToRelative(9.0f, 7.0f);
        i.lineToRelative(2.1f, -1.63f);
        i.lineToRelative(1.42f, 1.42f);
        i.lineToRelative(-3.53f, 2.75f);
        i.lineToRelative(-7.37f, -5.73f);
        i.lineTo(3.0f, 14.07f);
        i.lineToRelative(9.0f, 7.0f);
        i.lineToRelative(4.95f, -3.85f);
        i.lineTo(20.73f, 21.0f);
        gy.B(i, 1.41f, -1.41f, 3.41f, 0.86f);
        i.moveTo(12.0f, 13.47f);
        i.lineTo(6.26f, 9.0f);
        i.lineToRelative(1.39f, -1.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 5.02f, 5.02f, -0.67f, 0.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = build;
        build.getClass();
        return build;
    }
}
