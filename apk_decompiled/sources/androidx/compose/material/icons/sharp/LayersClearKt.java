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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.Sharp sharp) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LayersClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 9.0f, -9.0f, -7.0f);
        fc.C(e, -2.59f, 2.02f, 7.87f, 7.87f);
        e.moveTo(21.0f, 14.07f);
        e.lineToRelative(-1.63f, -1.27f);
        fc.C(e, -0.67f, 0.52f, 1.43f, 1.43f);
        e.moveTo(3.41f, 0.86f);
        e.lineTo(2.0f, 2.27f);
        e.lineToRelative(4.22f, 4.22f);
        e.lineTo(3.0f, 9.0f);
        e.lineToRelative(9.0f, 7.0f);
        e.lineToRelative(2.1f, -1.63f);
        e.lineToRelative(1.42f, 1.42f);
        e.lineToRelative(-3.53f, 2.75f);
        e.lineToRelative(-7.37f, -5.73f);
        e.lineTo(3.0f, 14.07f);
        e.lineToRelative(9.0f, 7.0f);
        e.lineToRelative(4.95f, -3.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 20.73f, 21.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = build;
        build.getClass();
        return build;
    }
}
