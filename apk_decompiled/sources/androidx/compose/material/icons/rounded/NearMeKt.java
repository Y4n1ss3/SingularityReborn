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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearMeKt {
    private static ImageVector _nearMe;

    public static final ImageVector getNearMe(Icons.Rounded rounded) {
        ImageVector imageVector = _nearMe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearMe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.75f, 3.94f, 4.07f, 10.08f);
        i.curveToRelative(-0.83f, 0.35f, -0.81f, 1.53f, 0.02f, 1.85f);
        i.lineTo(9.43f, 14.0f);
        i.curveToRelative(0.26f, 0.1f, 0.47f, 0.31f, 0.57f, 0.57f);
        i.lineToRelative(2.06f, 5.33f);
        i.curveToRelative(0.32f, 0.84f, 1.51f, 0.86f, 1.86f, 0.03f);
        i.lineToRelative(6.15f, -14.67f);
        i.curveToRelative(0.33f, -0.83f, -0.5f, -1.66f, -1.32f, -1.32f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMe = build;
        build.getClass();
        return build;
    }
}
