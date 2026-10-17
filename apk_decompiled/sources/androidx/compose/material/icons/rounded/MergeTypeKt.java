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
import defpackage.er;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MergeTypeKt {
    private static ImageVector _mergeType;

    public static final ImageVector getMergeType(Icons.Rounded rounded) {
        ImageVector imageVector = _mergeType;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MergeType", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.7f, 19.7f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(-2.7f, -2.7f);
        b.lineTo(13.59f, 17.0f);
        b.lineToRelative(2.7f, 2.7f);
        b.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        uo.q(b, 8.71f, 8.0f, 11.0f, 5.59f);
        b.lineToRelative(-4.71f, 4.7f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(4.71f, -4.7f);
        b.curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f);
        b.verticalLineTo(8.0f);
        b.horizontalLineToRelative(2.29f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        b.lineToRelative(-3.29f, -3.29f);
        b.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        b.lineTo(8.35f, 7.15f);
        b.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mergeType = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMergeType$annotations(Icons.Rounded rounded) {
    }
}
