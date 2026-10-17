package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import defpackage.sn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new sn0(1));

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shapes LocalShapes$lambda$0() {
        return new Shapes(null, null, null, null, null, 31, null);
    }

    public static final CornerBasedShape bottom(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.copy$default(cornerBasedShape, cornerSize, cornerSize, null, null, 12, null);
    }

    public static /* synthetic */ CornerBasedShape bottom$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return bottom(cornerBasedShape, cornerSize);
    }

    public static final CornerBasedShape end(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.copy$default(cornerBasedShape, cornerSize, null, null, cornerSize, 6, null);
    }

    public static /* synthetic */ CornerBasedShape end$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return end(cornerBasedShape, cornerSize);
    }

    public static final Shape fromToken(Shapes shapes, ShapeKeyTokens shapeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return shapes.getExtraLargeIncreased$material3();
            case 3:
                return shapes.getExtraExtraLarge$material3();
            case 4:
                return top$default(shapes.getExtraLarge(), null, 1, null);
            case 5:
                return shapes.getExtraSmall();
            case 6:
                return top$default(shapes.getExtraSmall(), null, 1, null);
            case 7:
                return RoundedCornerShapeKt.getCircleShape();
            case 8:
                return shapes.getLarge();
            case 9:
                return shapes.getLargeIncreased$material3();
            case 10:
                return end$default(shapes.getLarge(), null, 1, null);
            case 11:
                return top$default(shapes.getLarge(), null, 1, null);
            case Matrix.TranslateX /* 12 */:
                return shapes.getMedium();
            case Matrix.TranslateY /* 13 */:
                return RectangleShapeKt.getRectangleShape();
            case Matrix.TranslateZ /* 14 */:
                return shapes.getSmall();
            case 15:
                return start$default(shapes.getLarge(), null, 1, null);
            default:
                defpackage.o.n();
                return null;
        }
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }

    public static final Shape getValue(ShapeKeyTokens shapeKeyTokens, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        Shape fromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final CornerBasedShape start(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.copy$default(cornerBasedShape, null, cornerSize, cornerSize, null, 9, null);
    }

    public static /* synthetic */ CornerBasedShape start$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return start(cornerBasedShape, cornerSize);
    }

    public static final CornerBasedShape top(CornerBasedShape cornerBasedShape, CornerSize cornerSize) {
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, cornerSize, cornerSize, 3, null);
    }

    public static /* synthetic */ CornerBasedShape top$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return top(cornerBasedShape, cornerSize);
    }
}
