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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShuffleKt {
    private static ImageVector _shuffle;

    public static final ImageVector getShuffle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shuffle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Shuffle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 4.0f, -5.5f, 2.04f, 2.04f);
        i.lineTo(4.0f, 18.59f);
        i.lineTo(5.41f, 20.0f);
        r6.C(i, 17.96f, 7.46f, 20.0f, 9.5f);
        i.moveTo(5.41f, 4.0f);
        i.lineTo(4.0f, 5.41f);
        fc.C(i, 5.17f, 5.17f, 1.42f, -1.41f);
        i.moveTo(20.0f, 20.0f);
        i.verticalLineToRelative(-5.5f);
        i.lineToRelative(-2.04f, 2.04f);
        i.lineToRelative(-3.13f, -3.13f);
        i.lineToRelative(-1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 3.13f, 3.13f, 14.5f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffle = build;
        build.getClass();
        return build;
    }
}
