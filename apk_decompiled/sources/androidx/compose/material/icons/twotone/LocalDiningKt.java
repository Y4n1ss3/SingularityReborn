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
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalDiningKt {
    private static ImageVector _localDining;

    public static final ImageVector getLocalDining(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.11f, 21.28f, 12.0f, 14.41f);
        i.lineToRelative(6.88f, 6.88f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(13.41f, 13.0f);
        i.lineToRelative(1.47f, -1.47f);
        i.curveToRelative(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f);
        i.curveToRelative(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f);
        i.curveToRelative(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f);
        i.curveToRelative(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f);
        bv.o(i, 3.7f, 19.87f, 1.41f, 1.41f);
        i.moveTo(3.91f, 9.16f);
        i.lineToRelative(4.19f, 4.18f);
        i.lineToRelative(2.83f, -2.83f);
        i.lineTo(3.91f, 3.5f);
        i.curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localDining = build;
        build.getClass();
        return build;
    }
}
