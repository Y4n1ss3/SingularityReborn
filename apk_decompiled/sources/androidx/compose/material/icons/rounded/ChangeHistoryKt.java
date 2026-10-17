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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeHistoryKt {
    private static ImageVector _changeHistory;

    public static final ImageVector getChangeHistory(Icons.Rounded rounded) {
        ImageVector imageVector = _changeHistory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChangeHistory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(12.0f, 7.77f, 18.39f, 18.0f, 5.61f);
        p.lineTo(12.0f, 7.77f);
        p.moveToRelative(-0.85f, -2.41f);
        p.lineToRelative(-8.2f, 13.11f);
        p.curveToRelative(-0.41f, 0.67f, 0.07f, 1.53f, 0.85f, 1.53f);
        p.horizontalLineToRelative(16.4f);
        p.curveToRelative(0.79f, 0.0f, 1.26f, -0.86f, 0.85f, -1.53f);
        p.lineToRelative(-8.2f, -13.11f);
        p.curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeHistory = build;
        build.getClass();
        return build;
    }
}
