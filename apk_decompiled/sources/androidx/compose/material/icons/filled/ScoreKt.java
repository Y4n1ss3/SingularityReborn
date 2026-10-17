package androidx.compose.material.icons.filled;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Filled filled) {
        ImageVector imageVector = _score;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Score", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(i, 12.0f, 5.0f, 1.5f, 3.0f);
        i.lineToRelative(2.0f, -3.0f);
        i.horizontalLineToRelative(1.7f);
        i.lineToRelative(-2.0f, 3.0f);
        i.lineToRelative(2.0f, 3.0f);
        fc.D(i, -1.7f, -2.0f, -3.0f, 3.0f);
        r6.C(i, 12.0f, 11.0f, 12.0f, 5.0f);
        i.moveTo(7.0f, 7.25f);
        i.horizontalLineToRelative(2.5f);
        i.lineTo(9.5f, 6.5f);
        i.lineTo(7.0f, 6.5f);
        fc.w(i, 7.0f, 5.0f, 4.0f, 3.75f);
        i.lineTo(8.5f, 8.75f);
        i.verticalLineToRelative(0.75f);
        i.lineTo(11.0f, 9.5f);
        i.lineTo(11.0f, 11.0f);
        r6.C(i, 7.0f, 11.0f, 7.0f, 7.25f);
        i.moveTo(19.0f, 13.0f);
        i.lineToRelative(-6.0f, 6.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.lineToRelative(-4.0f, 4.0f);
        i.verticalLineToRelative(-2.5f);
        i.lineToRelative(4.0f, -4.0f);
        i.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 6.0f, -6.0f, 19.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = build;
        build.getClass();
        return build;
    }
}
